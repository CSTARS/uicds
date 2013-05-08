To run Json2Soi:

1. The configuration file is config-usgs
2. You need to change the user, password and hostname of your core.
3. The jsonfile property is telling what file to look for to load in the current directory.
4. When it runs, it will create a usgs-1.tmp file.  This file is to keep track of whether the new set of fieldnotes.json has one that had already been processed previously.
5. At the prompt, java -jar json2incidentAdapter.jar config-usgs.props



